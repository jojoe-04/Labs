#include <iostream>

using namespace std;

int main(){

	int first, second, third, fourth, fifth, mean;
	std::cout << "Enter 5 numbers: " << std::endl;
	std::cin >> first >> second >> third >> fourth >> fifth;
	mean = (first + second + third + fourth + fifth)/5;
	std::cout << "Mean: " << mean << std::endl;
}

