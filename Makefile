
define do_call
	echo "## $(5)" >> $(OUTPUT)
	echo "### C" >> $(4)
	echo "\`\`\`" >> $(4)
	bin/c_$(1)_$(2) $(3) 1>>$(4) 2>>$(4) ; true
	echo "\`\`\`" >> $(4)
	echo "### Golang" >> $(4)
	echo "\`\`\`" >> $(4)
	bin/go_$(1)_$(2) $(3) 1>>$(4) 2>>$(4) ; true
	echo "\`\`\`" >> $(4)
	echo "### Rust" >> $(4)
	echo "\`\`\`" >> $(4)
	bin/rust_$(1)_$(2) $(3) 1>>$(4) 2>>$(4) ; true
	echo "\`\`\`" >> $(4)
	# Вывод Java отключил, так как там тоже всегда что и в Kotlin
	# echo "### Java" >> $(4)
	# echo "\`\`\`" >> $(4)
	# java -cp bin/java.jar p$(1)_e$(2) $(3)  1>>$(4) 2>>$(4) ; true
	# echo "\`\`\`" >> $(4)
	echo "### Kotlin" >> $(4)
	echo "\`\`\`" >> $(4)
	java -cp bin/kotlin.jar P$(1)_e$(2)Kt $(3) 1>>$(4) 2>>$(4) ; true
	echo "\`\`\`" >> $(4)
endef

run_1_1: build_all
	$(eval OUTPUT=report/part1.md)
	echo "# Разбираем наивный пример где вообще не думали про ошибки" > $(OUTPUT)
	$(call do_call,1,1,resources/part_1/num.txt,$(OUTPUT),Когда все ок)
	$(call do_call,1,1,resources/part_1/spaced_num.txt,$(OUTPUT),Число с пробелами вокруг)
	$(call do_call,1,1,resources/part_1/no_num_suffix.txt,$(OUTPUT),Число после которого сразу буквы)
	$(call do_call,1,1,resources/part_1/empty_num.txt,$(OUTPUT),Пустой файл)
	$(call do_call,1,1,resources/part_1/__no_such_file__.txt,$(OUTPUT),Не существующий файл)
	$(call do_call,1,1,resources/part_1,$(OUTPUT),Дирктория)
	$(call do_call,1,1,,$(OUTPUT),Забыли передать параметр)




build_all: build_kotlin build_java build_golang build_rust build_c


build_kotlin:
	cd kotlin/errors_kotlin && \
	./gradlew jar && \
	cp build/libs/errors_kotlin-1.0-SNAPSHOT.jar ../../bin/kotlin.jar

build_java:
	cd java && \
	./gradlew jar && \
	cp build/libs/java-1.0-SNAPSHOT.jar ../bin/java.jar

build_golang:
	cd golang && \
	go build -o ../bin/go_1_1 ./cmd/p1/e1/go_1_1.go

build_rust:
	cd rust && \
	cargo build --package rust --bin rust_1_1 && \
	cp target/debug/rust_1_1 ../bin/rust_1_1

build_c:
	cd c && \
	cmake --build cmake-build-debug && \
	cp cmake-build-debug/c_1_1 ../bin/c_1_1