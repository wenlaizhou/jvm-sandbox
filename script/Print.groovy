import com.alibaba.jvm.sandbox.agent.main.MyInterface

class Print implements MyInterface {

    def void print() {
        println "hello world"
    }
}