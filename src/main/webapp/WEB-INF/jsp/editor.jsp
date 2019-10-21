
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻编辑</title>
    <link rel="stylesheet" href="/resources/css/news_list.css" />
    <script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js" ></script>
    <script type="text/javascript" src="/resources/js/index.js" ></script>

    <script type="text/javascript" src="/resources/wangEditor-3.1.1/release/wangEditor.min.js"></script>

    <style>
        .top{
            width: 100%;
            height: 40px;
            padding-top:10px;
            background-color: #1B6D85;
            color: white;
        }
        .top_title{
            margin-left: 10px;
        }


        #title{
            width: 200px;
            height: 25px;
        }

        #btn1{
            float: right;
            width: 50px;
            height: 30px;
            background-color: #999999;
            color: black;
            margin-right: 13px;
        }
        #editorMenu {
            border: 1px solid #ccc;
        }
        #editor {
            border: 1px solid #ccc;
            min-height: 410px;
        }
    </style>


</head>
<body>
<div class="top">
    <span class="top_title">标题:</span><input id="title" name="title" type="input" placeholder="请输入标题" maxlength="30" value="" />
    <button id="btn1">提交</button>
    <span id="newsAuthor" style="float: right;margin-right: 30px;">${user.username}</span>
    <span style="float: right;">作者:</span>


</div>


<div id="editorMenu"></div>
<div id="editor">

</div>



<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
<script type="text/javascript" src="/resources/wangEditor-3.1.1/release/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor
    var editor = new E('#editorMenu','#editor')
    editor.customConfig.menus = [
        'head',  // 标题
        'bold',  // 粗体
        'fontSize',  // 字号
        'fontName',  // 字体
        'italic',  // 斜体
        'underline',  // 下划线
        'strikeThrough',  // 删除线
        'foreColor',  // 文字颜色
        'backColor',  // 背景颜色
        'link',  // 插入链接
        'list',  // 列表
        'justify',  // 对齐方式
        'quote',  // 引用
        'emoticon',  // 表情
        'image',  // 插入图片
        'table',  // 表格
        'code',  // 插入代码
        'undo',  // 撤销
        'redo'  // 重复
    ]
    //editor.customConfig.uploadImgShowBase64 = true
    editor.customConfig.uploadImgServer = '/editor/upload'
    editor.customConfig.uploadFileName = 'upimg'
    editor.create()





    document.getElementById('btn1').addEventListener('click', function () {
        // 读取 html

        var text = editor.txt.html();
        var date = new Date();
        date = date.toLocaleDateString();

        var newsTitle = document.getElementById('title').value;
        var newsAuthor = document.getElementById('newsAuthor').innerText;


        if(editor.txt.text()==""||newsTitle==""){
            alert("请填写完整内容！");
        }else if(newsTitle.length>=30){
            alert("标题过长！");
        }else{
            $.ajax({
                type: "POST",
                url: "/editor/submit",
                data: {"data": text,"newsAuthor": newsAuthor,"newsTitle":newsTitle,"date":date},
                dataType: "json",
                success: function (result) {
                    if (result.result=="success"){
                        alert("提交成功,等待管理员审核！");
                        location.href="../news/list";
                    }else {
                        alert("提交失败");
                    }

                }


            });
        }



    }, false)
</script>



</body>

</html>
