package com.example

import zio.*

object Main extends ZIOAppDefault:
  override def run =
    Console.printLine("Hello, World!")
