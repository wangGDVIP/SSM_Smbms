<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<%@include file="/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>供应商管理页面 >> 供应商添加页面</span>
        </div>
        <div class="providerAdd">
           <fm:form id="providerForm" name="providerForm" method="post" 
           			action="${pageContext.request.contextPath }/pro/addProvider.do"
           				modelAttribute="provider" enctype="multipart/form-data">
			<input type="hidden" name="method" value="add">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="proCode">供应商编码：</label>
                    <input type="text" name="proCode" id="proCode" value="ABC-123"> 
					<!-- 放置提示信息 -->
					<font color="red"></font>
                </div>
                <div>
                    <label for="proName">供应商名称：</label>
                   <input type="text" name="proName" id="proName" value="大炮公司"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="proContact">联系人：</label>
                    <input type="text" name="proContact" id="proContact" value="张大炮"> 
					<font color="red"></font>

                </div>
                <div>
                    <label for="proPhone">联系电话：</label>
                    <input type="text" name="proPhone" id="proPhone" value="13245679810"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="proAddress">联系地址：</label>
                    <input type="text" name="proAddress" id="proAddress" value="地球"> 
                </div>
                <div>
                    <label for="proFax">传真：</label>
                    <input type="text" name="proFax" id="proFax" value="666-666666"> 
                </div>
                <div>
                    <label for="proDesc">描述：</label>
                    <input type="text" name="proDesc" id="proDesc" value="什么都卖"> 
                </div>
                <div>
                    <label for="photoPath">企业营业执照：</label>
                    <input type="file" name="picture" id="photoPath"> 
                </div>
                 <div>
                    <label>组织机构代码证：</label>
                    <input type="file" name="picturePaths" > <br />
                    <input type="file" name="picturePaths" >
                </div>
                
                <div class="providerAddBtn">
                    <input type="button" id="add" name="add" value="保存">
					<input type="button" id="back" name="back" value="返回" >
                </div>
            </fm:form>
     </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/provideradd.js"></script>
