PREFIX = /usr/local/bin

hello_makefile: hello.c
	${CC} -o hello_makefile hello.c

clean:
	rm -f hello_makefile

install: hello_makefile
	cp hello_makefile $(PREFIX)/hello_makefile
