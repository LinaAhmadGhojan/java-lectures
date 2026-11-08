@echo off
cd /d "%~dp0"
if not exist out mkdir out
javac -d out src\wildcards\*.java || goto :eof
for %%n in (1 2 3 4 5 6) do (
  echo --- Ex%%n ---
  java -cp out wildcards.Ex%%n
)
pause
