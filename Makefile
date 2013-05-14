jar: Jarvis.java
	make -C bin/ jar

Jarvis.java: 
	javac -d bin/ -sourcepath src src/org/mikelyons/jarvis/Jarvis.java

run: Jarvis.java
	java -classpath bin org.mikelyons.jarvis.Jarvis

test: build-test
	java -cp bin:lib/Test.jar org.mikelyons.jarvis.test.TestSuite

build-test: Jarvis.java
	javac -d bin/ -cp lib/Test.jar -sourcepath src src/org/mikelyons/jarvis/test/TestSuite.java
