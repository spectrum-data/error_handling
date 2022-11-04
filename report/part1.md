# Разбираем наивный пример где вообще не думали про ошибки
## Когда все ок
### C
```
123 * 123 = 15129
```
### Golang
```
123 * 123 = 15129
```
### Rust
```
123 * 123 = 15129
```
### Kotlin
```
123 * 123 = 15129
```
## Число с пробелами вокруг
### C
```
1230 * 1230 = 1512900
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: InvalidDigit }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "  123"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:638)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at P1_e1Kt.main(p1_e1.kt:13)
```
## Число после которого сразу буквы
### C
```
123 * 123 = 15129
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: InvalidDigit }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "123ABC"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at P1_e1Kt.main(p1_e1.kt:13)
```
## Пустой файл
### C
```
0 * 0 = 0
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: Empty }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: offset 0, count -1, length 10
	at java.base/java.lang.String.checkBoundsOffCount(String.java:3304)
	at java.base/java.lang.String.<init>(String.java:505)
	at P1_e1Kt.main(p1_e1.kt:12)
```
## Не существующий файл
### C
```
Segmentation fault (core dumped)
```
### Golang
```
panic: open resources/part_1/__no_such_file__.txt: no such file or directory

goroutine 1 [running]:
main.main()
	/media/comdiv/data/code/error_handling/golang/cmd/p1/e1/go_1_1.go:15 +0x1a5
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: Os { code: 2, kind: NotFound, message: "No such file or directory" }', src/p1/e1/main.rs:9:38
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.io.FileNotFoundException: resources/part_1/__no_such_file__.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at P1_e1Kt.main(p1_e1.kt:11)
```
## Дирктория
### C
```
0 * 0 = 0
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: Os { code: 21, kind: IsADirectory, message: "Is a directory" }', src/p1/e1/main.rs:11:36
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.io.FileNotFoundException: resources/part_1 (Is a directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at P1_e1Kt.main(p1_e1.kt:11)
```
## Забыли передать параметр
### C
```
Segmentation fault (core dumped)
```
### Golang
```
panic: runtime error: index out of range [1] with length 1

goroutine 1 [running]:
main.main()
	/media/comdiv/data/code/error_handling/golang/cmd/p1/e1/go_1_1.go:11 +0x1af
```
### Rust
```
thread 'main' panicked at 'index out of bounds: the len is 1 but the index is 1', src/p1/e1/main.rs:8:21
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at P1_e1Kt.main(p1_e1.kt:8)
```
