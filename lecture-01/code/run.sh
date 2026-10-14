#!/bin/sh
# Run the Lecture 1 examples (Linux / macOS / Git Bash).   Usage:  sh run.sh
# Requires the JDK (javac). Put the project in an English path.
cd "$(dirname "$0")" || exit 1

if ! command -v javac >/dev/null 2>&1; then
  echo "[!] javac was not found. Please install the JDK first (https://adoptium.net)."
  exit 1
fi

mkdir -p out
javac -encoding UTF-8 -sourcepath src -d out src/launcher/MainMenu.java || exit 1
java -cp out launcher.MainMenu
