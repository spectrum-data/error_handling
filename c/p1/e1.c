#include <stdio.h>
#include <stdlib.h>

int main(int _, char * argv[]) {
    char* filename = argv[1];
    FILE* f = fopen(filename,"r");
    const char buffer[10] ;
    fread(&buffer,10,1,f);
    int number = strtol(&buffer ,NULL,0);
    printf("%d * %d = %d\n", number, number, number * number);
    return 0;
}