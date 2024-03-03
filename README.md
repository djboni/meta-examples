# Tests and Example Recipes for Yocto

GitHub: https://github.com/djboni/meta-examples

Meta layer with tests and example recipes for Yocto.

## Example 1

Build core-image-minimal and run it with Qemu:

```console
$ bitbake core-image-minimal
$ runqemu core-image-minimal
```

In Qemu login as root and test the hello... executables:

```console
image# hello_cc
image# hello_makefile
image# hello_cmake
```

## Example 2

Build core-image-sato and run it with Qemu:

```console
$ bitbake core-image-sato
$ runqemu core-image-sato
```

In Qemu open a terminal and test the simplecalculator executable:

```console
image# simplecalculator
```
