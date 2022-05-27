package com.example.wechatdemo.wechat.eum;



public enum DemoEnum {

    MERCHANT_SHOP_SHARE(7,  "asfsdf"),
    YEAR_REPORT_SCENE(8, "asdfasd"),
    ;
    private Integer sceneCode;
    private String desc;

    DemoEnum(Integer sceneCode, String desc){
        this.sceneCode = sceneCode;
        this.desc = desc;
    }

    public Integer getSceneCode() {
        return sceneCode;
    }
}
