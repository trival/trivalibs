package xyz.trival.libs.assertions

import munit.*
import munit.Assertions.*

extension (obtained: Any)
  inline infix def ==>[B](
      expected: B
  ): Unit =
    assertEquals(obtained, expected, clue)
