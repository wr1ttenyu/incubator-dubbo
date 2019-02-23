package org.apache.dubbo.demo.provider.filter;

import org.apache.dubbo.rpc.*;

public class DemoFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("My DemoService is invoked......");
        return invoker.invoke(invocation);
    }

    @Override
    public Result onResponse(Result result, Invoker<?> invoker, Invocation invocation) {
        System.out.println("My DemoService is responsing......");
        return result;
    }
}
