//消息点击确定后退出
function messageNotShow() {
    document.getElementById('haveMessage').remove();
}

//激活按钮
function activeTab(tab) {

    var activeFlag = tab.getAttribute("href") == "#tab1"
    if (activeFlag) {
        //如果传入的tab是active-tab1
        //移除active-tab2 激活样式
        document.getElementById('active-tab2').setAttribute("class", "tab-link button")
    } else {
        //反之亦然
        document.getElementById('active-tab1').setAttribute("class", "tab-link button")
    }
    tab.setAttribute("class", 'tab-link button active');

}

/**
 * 展开计划
 * @param num 第几条
 */
function expanded(num) {
    var element = document.getElementById(num.charAt(0) + '-' + num.charAt(4));
    if (num.charAt(2) == ('p')) {
        element.setAttribute('class', 'accordion-item accordion-item-expanded')
    } else {
        element.setAttribute('class', 'accordion-item')
    }
}
