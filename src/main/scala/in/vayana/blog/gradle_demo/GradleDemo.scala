package in.vayana.blog.gradle_demo
import com.weiglewilczek.slf4s.Logger


object GradleDemo {
  val logger = Logger("in.vayana.blog.gradle_demo")
  def foo() = {
    logger.debug("in method foo")
    "bar"
  }
  def main(args: Array[String]) = {
	logger.debug("hello world!")
  }
}