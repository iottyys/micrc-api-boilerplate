package io.ttyys.core.support.camel;

import com.snszyk.iiot.lim.quota.domain.condition.Condition;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.stereotype.Component;

@Component
public class StandardApplicationServiceInvokeRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("direct:io.ttyys.core.support.StandardApplicationServiceInvoke")
                // todo 判断是否为自定义实现的service
                // todo 如果是，使用dozer转换参数
                // todo 使用bean调用自定义service实现
                // todo 使用dozer转换返回值

                // todo 如果不是自定义实现的service
                // todo 使用marshal将对象转换为json
                // todo 使用jslt读取jslt转换文件，将json转换为service要求的格式
                // todo 使用bean执行接口实现
                // todo 使用jslt将结果json转换为返回值要求的格式
                // todo 使用unmarshal将json转换为结果对象
                .log("direct:io.ttyys.core.support.StandardApplicationServiceInvoke");
    }

    public static void main(String[] args) throws Exception {
        try (CamelContext camel = new DefaultCamelContext()) {
            camel.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    intercept().to("log:hello");
                    from("timer:foo?exchangePattern=InOut")
                            .bean(ReturnObj.class)
                            .bean(Test.class, "tcreate")
//                            .transform().simple("${body.changeState}")
                            .log(simple("${body}").getText());
                }
            });
            camel.start();
            Thread.sleep(10_000);
            camel.stop();
        }
    }

    public static class Test {
        public static ReturnObj create() {
            return new ReturnObj();
        }
        public Test tcreate() {
            return new Test();
        }
    }

    public static class ReturnObj {
        int i = 1;

        public void changeState() {
            this.i = 2;
        }
    }
}
