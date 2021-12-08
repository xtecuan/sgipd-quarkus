#!/bin/bash

export LOFFICE=/cygdrive/c/Work/Native/LibreOffice
export PATH=$LOFFICE/program:$PATH
export FOLDER_PROCESS=/cygdrive/c/Users/xtecuan/Documents/MINED/SGIPD/documento_tramite

cd $FOLDER_PROCESS
for i in $(ls)
do
echo "Processing $i"
cd $i
count=$(ls -1 *.doc 2>/dev/null | wc -l)
if [ $count != 0 ]
then
swriter --convert-to pdf *.doc
fi
count=$(ls -1 *.docx 2>/dev/null | wc -l)
if [ $count != 0 ]
then
swriter --convert-to pdf *.docx
fi
cd ..
done
