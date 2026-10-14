@echo off
rem ============================================================
rem  Run the Lecture 1 examples (Windows).  Double-click this file.
rem  Requires the JDK (javac). Put the project in an ENGLISH path.
rem ============================================================
cd /d "%~dp0"

where javac >nul 2>nul
if errorlevel 1 (
  echo.
  echo [!] javac was not found. Please install the JDK and try again.
  echo     Download: https://adoptium.net
  echo.
  pause
  exit /b 1
)

if not exist out mkdir out

javac -encoding UTF-8 -sourcepath src -d out src\launcher\MainMenu.java
if errorlevel 1 (
  echo.
  echo [!] Compile error. Read the message above.
  pause
  exit /b 1
)

java -cp out launcher.MainMenu
pause
