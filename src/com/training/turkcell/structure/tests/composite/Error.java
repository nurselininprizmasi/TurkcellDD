package com.training.turkcell.structure.tests.composite;

import java.util.ArrayList;
import java.util.List;

public class Error {
    private List<Error> subErrors;
    private String boundedContext;
    private String microService;
    private String errorDesc;
    private int errorCause;

    public Error addSubError(Error subError){
        if(subErrors == null){
            subErrors = new ArrayList<>();
        }
        subErrors.add(subError);
        return this;
    }

    public String getBoundedContext() {
        return boundedContext;
    }

    public Error setBoundedContext(String boundedContext) {
        this.boundedContext = boundedContext;
        return this;
    }

    public String getMicroService() {
        return microService;
    }

    public Error setMicroService(String microService) {
        this.microService = microService;
        return this;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public Error setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    public int getErrorCause() {
        return errorCause;
    }

    public Error setErrorCause(int errorCause) {
        this.errorCause = errorCause;
        return this;
    }

    public List<Error> getSubErrors() {
        return subErrors;
    }

    public void setSubErrors(List<Error> subErrors) {
        this.subErrors = subErrors;
    }


    public String toFormattedStr(String prefix) {
        final StringBuilder sb = new StringBuilder("Error{");

        sb.append(", boundedContext='").append(boundedContext).append('\'');
        sb.append(", microService='").append(microService).append('\'');
        sb.append(", errorDesc='").append(errorDesc).append('\'');
        sb.append(", errorCause=").append(errorCause);
        sb.append(prefix);
        sb.append("subErrors=").append(subErrors);
        if(this.subErrors!= null){
            String nextPrefix = prefix +"\t";
            for(Error error :this.subErrors){
                sb.append("\t");
                sb.append(error);
                sb.append("\n");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Error{");

        sb.append(", boundedContext='").append(boundedContext).append('\'');
        sb.append(", microService='").append(microService).append('\'');
        sb.append(", errorDesc='").append(errorDesc).append('\'');
        sb.append(", errorCause=").append(errorCause);
        sb.append("subErrors=").append(subErrors);
        if(this.subErrors!= null){
            for(Error error :this.subErrors){
                sb.append("\t");
                sb.append(error);
                sb.append("\n");
            }
        }
        sb.append('}');
        return sb.toString();
    }

}
