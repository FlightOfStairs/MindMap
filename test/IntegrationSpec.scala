import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {

  "Application" should {
    "show the index page" in new WithBrowser {
      browser.goTo("http://localhost:" + port)
      browser.pageSource must contain("MindMap")
      browser.pageSource must contain("Coming soon.")
    }
  }
}
