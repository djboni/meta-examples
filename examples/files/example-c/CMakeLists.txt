cmake_minimum_required(VERSION 3.0)

project(
  hello_cmake
  VERSION 1.0
  LANGUAGES C)

add_executable(hello_cmake hello.c)

install (TARGETS hello_cmake RUNTIME DESTINATION bin)
