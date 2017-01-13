#!/bin/sh

./dependencyviewer.sh -help

./dependencyviewer.sh
./dependencyviewer.sh "Example isn't another way to teach, it's the only way to teach" "Colorless green ideas sleep furiously."
./dependencyviewer.sh -frames "Example isn't another way to teach, it's the only way to teach" "Colorless green ideas sleep furiously."
./dependencyviewer.sh -in testsent.txt
./dependencyviewer.sh -factory ALL "A quick brown fox jumped over the lazy dog"
./dependencyviewer.sh -factory CCPROCESSED "A quick brown fox jumped over the lazy dog"

./dependencyviewer.sh -out input
./dependencyviewer.sh -out example "Example isn't another way to teach, it's the only way to teach" "Colorless green ideas sleep furiously."
./dependencyviewer.sh -out testsent -in testsent.txt
