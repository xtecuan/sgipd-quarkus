#!/bin/bash

#export LOFFICE=/cygdrive/c/Work/Native/LibreOffice
export LOFFICE=/opt/libreoffice7.2
export PATH=$LOFFICE/program:$PATH
#export FOLDER_PROCESS=/cygdrive/c/Users/xtecuan/Documents/MINED/SGIPD/documento_tramite
export FOLDER_PROCESS=/opt/sigobsol
export GS_BIN=/usr/bin/gs

cd $FOLDER_PROCESS
for i in $(ls)
do
echo "Processing $i"
cd $i
count=$(ls -1 *.pdf 2>/dev/null | wc -l)
if [ $count != 0 ]
then
 $GS_BIN -dNOPAUSE -sDEVICE=pdfwrite -sOUTPUTFILE="${i}.pdf" -dBATCH "*.pdf"
fi
cd ..
done