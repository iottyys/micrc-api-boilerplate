/**
 * 通信端口包，按定义的通信协议组织，协议可自定义，不建议多技术协议一个端口
 * 如可以将所有的消息接收定义为一个端口，消息发送定义为一个端口；也可以按通信服务把A服务的消息接收定义为一个端口。总之可以灵活定义
 * 端口内是适配器，可按不同维度组织，如gql可按端口/服务，用例对resolver进行组织，mybatis，message，messaging可按聚合组织等
 */
package com.snszyk.iiot.lim.quota.infrastructure.ports;