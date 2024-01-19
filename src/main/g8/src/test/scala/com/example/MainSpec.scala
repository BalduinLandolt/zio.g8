package com.example

import zio.test.*

object MainSpec extends ZIOSpecDefault {

  def spec = suite("MainSpec")(
    test("test") {
      assertTrue(true)
    }
  )

}
