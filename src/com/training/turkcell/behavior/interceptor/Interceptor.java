package com.training.turkcell.behavior.interceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Interceptor implements IInterceptor {
    private final Map<String, IInterceptor> map = new ConcurrentHashMap<>();

    public Interceptor() {
        DirCommand dirCommand = new DirCommand();
        RunCommand runCommand = new RunCommand();
        SearchCommand searchCommand = new SearchCommand();
        AltInterceptor altInterceptorLoc = new AltInterceptor();
        this.map.put(dirCommand.getCommandStr(), dirCommand);
        this.map.put(runCommand.getCommandStr(), runCommand);
        this.map.put(searchCommand.getCommandStr(), searchCommand);
        this.map.put(altInterceptorLoc.getCommandStr(), altInterceptorLoc);
    }

    //komut->AltKomut->parametereler
    @Override
    public void intercept(String strParam) {
        String[] splitLoc = strParam.trim()
                .split(" ");
        IInterceptor iInterceptorLoc = this.map.get(splitLoc[0]);
        if (iInterceptorLoc != null) {
            iInterceptorLoc.intercept(strParam.substring(splitLoc[0].length() + 1));
        }
    }

    @Override
    public String getCommandStr() {
        throw  new IllegalStateException();
    }


}
