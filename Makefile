build: main.o
	g++ -o jarvis bin/main.o

main.o: src/main.cpp
	g++ -o bin/main.o -c src/main.cpp
