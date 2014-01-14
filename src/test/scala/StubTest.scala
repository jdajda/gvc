package pl.edu.agh

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubTest extends FunSpec with ShouldMatchers {

  describe("you description here") {
    it("should do something") {
      "Hello world" should equal("Hello world")
    }
  }
}
