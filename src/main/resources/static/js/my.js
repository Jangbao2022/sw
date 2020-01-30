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


/**
 * 展开target
 */
function showTarget(targetId) {
    var flagArray = {
        "0": [1, 2],
        "1": [3, 4, 5]
    }

    var flag = (targetId > 2) * 1

    for (i = 0; i < flagArray[flag].length; i++) {
        var a = document.getElementById("a-tab" + flagArray[flag][i])
        var div = document.getElementById("tab" + flagArray[flag][i])
        if (flagArray[flag][i] == targetId) {
            a.setAttribute("class", "tab-link active button")
            div.setAttribute("class", "tab active")
        } else {
            a.setAttribute("class", "tab-link button")
            div.setAttribute("class", "tab")
        }
    }

}


/**
 * 商品购买加一
 * @param id
 */
function shopAdd(id) {
    var elementById = document.getElementById(id);
    var value = parseInt(elementById.getAttribute("value"));
    elementById.setAttribute("value", value + 1);

}

/**
 * 商品购买减一
 * @param id
 */
function shopMinus(id) {
    var elementById = document.getElementById(id);
    var value = parseInt(elementById.getAttribute("value"));
    if (value > 1) {
        elementById.setAttribute("value", value - 1);
    }

}
