package com.yipai.tongzhouli.ui.activity;

import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

/**
 * Created by moram on 2016/9/22.
 * 景区介绍
 */
public class ScenicIntroductionActivity extends BaseActivity  {


    private MyFontTextView introductionTV;

    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_scenic_introduction);
    }

    @Override
    protected void initView() {
        setTitle("景区介绍");

        introductionTV=(MyFontTextView)findViewById(R.id.tv_introduction);

    }

    @Override
    protected void initEvent() {
        introductionTV.setText("湖为核心，建设南至官池镇驻地、北至冯翊路、西至商贸大道的同州湖4A级景区，促进产城、景城融合发展。4月10日，同州湖景区主要组成部分之一的同州湖西路开工建设。\n" +
                "据了解，该工程全长约1.9公里，道路红线宽度58—52米，两侧各4米宽的自行车道和11米宽的绿色景观带，计划总投资1.46亿元，景观绿化总面积达5.4万平方米。项目规划创意独特、设计概念新颖，其古典主题风格和简约的文化艺术气息，突出了幽静、闲适，与同州湖景区整体设计相得益彰。项目建成后，将成为一条连接城区与同州湖景区的景观大道，对于进一步提升城市品位，打造同州湖4A级旅游景区，促进县域经济融合发展具有极大的推动作用。");
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

        }
    }


}

