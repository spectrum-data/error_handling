#include <stdio.h>
#include <stdlib.h>

int main(int _, char * argv[]) {
    char* filename = argv[1];
    FILE* f = fopen(filename, "r");
    char buffer[10];
    fread(&buffer,10, 1, f);
    int number = atoi(buffer);
    printf("%d * %d = %d\n", number, number,number * number);
}
