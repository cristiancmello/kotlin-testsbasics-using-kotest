import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class RuntimeEvaluateTestsWithDynamicTests : FunSpec ({
    listOf(
        "sam",
        "pam",
        "tim"
    ).forEach {
        test("$it should be a three name") {
            it.shouldHaveLength(3)
        }
    }
})