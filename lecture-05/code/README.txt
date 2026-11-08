Lecture 5: Wildcards (runnable code)

Windows : double-click run.bat
Linux/macOS/Git Bash : sh run.sh

You need the JDK installed (https://adoptium.net).
Put this folder in an ENGLISH path (for example C:\wildcards_code).

To open it in IntelliJ: File > Open > choose this folder (code). Then run any ExN.main.

Files (package wildcards):
  Animal, Dog, Cat      the classes (Dog and Cat inherit from Animal)
  Box.java              the generic box Box<T> from lecture 4
  Ex1.java              Box<Dog> is not Box<Animal> (Invariance)
  Ex2.java              Box<?>  accepts any box
  Ex3.java              Box<? extends Animal>  read only (Producer)
  Ex4.java              Box<? super Dog>       write (Consumer)
  Ex5.java              copy with PECS
  Ex6.java              bounded type parameter <T extends Animal>

Each exercise has one commented line marked "error": remove the // to see the compiler refuse it.
