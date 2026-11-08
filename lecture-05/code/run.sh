#!/bin/sh
cd "$(dirname "$0")"
mkdir -p out
javac -d out src/wildcards/*.java || exit 1
for n in 1 2 3 4 5 6; do
  echo "--- Ex$n ---"
  java -cp out wildcards.Ex$n
done
