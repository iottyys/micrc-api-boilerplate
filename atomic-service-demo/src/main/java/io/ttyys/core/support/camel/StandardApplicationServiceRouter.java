package io.ttyys.core.support.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class StandardApplicationServiceRouter extends RouteBuilder {
    @Override
    public void configure() {
//        validator().type("json:input").withUri("");
//        validator().type("json:output").withUri("");
        from("direct:io.ttyys.core.support.StandardApplicationService")
                .setHeader("uri", constant("direct:start"))
                // todo 判断是否需要进行marshal为json，如果是则转换为json string
                // todo 使用json-schema-validator校验json
                // todo 执行指定的endpoint
                // todo 使用json-schema-validator校验结果json
                // todo 判断是否需要进行unmarshal为对象，如果是则转换为指定类型的对象
                .log("direct:io.ttyys.core.support.StandardApplicationService")
                .toD("${header.uri}");
        // todo 异常处理+事务
    }
}
