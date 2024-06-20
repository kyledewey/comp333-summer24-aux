#include "stdio.h"

int getValue(int index) {
  int arr[3] = { 4, 2, 6 };
  return arr[index];
}

int main() {
  int value = getValue(1000);
  printf("%i\n", value);
  return 0;
}
