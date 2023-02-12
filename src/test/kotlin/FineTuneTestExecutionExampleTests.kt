import io.kotest.core.spec.style.StringSpec
import kotlin.time.Duration.Companion.seconds

class FineTuneTestExecutionExampleTests : StringSpec ({
  "should use config".config(timeout = 2.seconds, invocations = 10, threads = 2, tags = setOf()) {
      // TODO: test here
  }
})