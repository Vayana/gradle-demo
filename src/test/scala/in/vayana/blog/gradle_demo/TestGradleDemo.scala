package in.vayana.blog.gradle_demo

import org.junit.runner.RunWith
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.runner.JUnitRunner
import com.weiglewilczek.slf4s.Logger
import org.slf4j.LoggerFactory

@RunWith(classOf[JUnitRunner])
class TestGradleDemo extends SpecificationWithJUnit {
    val logger = Logger("in.vayana.blog.gradle_demo.test")

    "Using GradleDemo" should {
      "Method foo should return value bar" in {
        println("this is a console output")
        logger.debug("this is a debug statement")
        GradleDemo.foo() must_== "bar"
      }
    }
}
