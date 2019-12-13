package com.yjhealth.libs.yjhealthstatistics.umeng;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.yjhealth.libs.yjhealthstatistics.api.StatisticsApi;

/**
 * 友盟统计
 */
public class UmengImpl implements StatisticsApi {

    public static StatisticsApi getInstance() {
        return new UmengImpl();
    }

    private UmengImpl() {
    }

    @Override
    public void init(Application application) {
        UMConfigure.init(application, UMConfigure.DEVICE_TYPE_PHONE, null);
        // 选用AUTO页面采集模式
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
    }
}
