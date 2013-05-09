#include <iostream>
#include <string>
#include <vector>

using namespace std;

int handleArgs( int argc, vector<string> argv ) {
	switch(argc) {
		case 2:
			cout << "Command: " << argv[1] << endl;
			if( argv[1].compare("hi") = 0 ) {
				cout << "Hello There" << endl;
			}
			break;
		case 1:
		case 0:
		default:
			cout << "Ussage: jarvis [COMMAND]" << endl;
	}
}

int main( int argc, char* argv[]) {
	
	vector<string> vect_argv;

	for( int i = 0; i < argc; i++ ) {
		string new_string(argv[i]);
		vect_argv.push_back( new_string );
	}

	if( argc > 0 ) {
		handleArgs( argc, vect_argv );
	}
	return 0;
}
