package cn.itsource.yangou.common;

public class ResultAjax {

    private boolean success=true;

    private String mesg="您操作成功";

    private Object obj=null;//操作后可能返回的数据封装

    public static ResultAjax me(){
        return new ResultAjax();
    }

    public ResultAjax() {
    }

    public ResultAjax(boolean success, String mesg, Object obj) {
        this.success = success;
        this.mesg = mesg;
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResultAjax setSuccess(boolean success) {
        this.success = success;
        /*链式开发
        * */
        return this;
    }

    public String getMesg() {
        return mesg;
    }

    public ResultAjax setMesg(String mesg) {
        this.mesg = mesg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ResultAjax setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    @Override
    public String toString() {
        return "ResultAjax{" +
                "success=" + success +
                ", mesg='" + mesg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
