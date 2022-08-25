$("#getValueButton").click(function() {
    // inputセレクタと:textセレクタとnameの名称で対象を特定
    // valメソッドで値を取得
    const str =  $('input:text[name="inputValue"]').val();
    $("#val1").text(str); // domに反映

    // ネイティブのトースト実行メソッドを呼び出し
    // 引数にはinputから取得した値を渡す
    WebAndroid.showToast(str)
});