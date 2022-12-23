<#macro greet person>

   <#if person == "dalong" >
      <div> this is dalong</div>
      <#else>
        <font size="+2">Hello ${person}!</font>
   </#if>
</#macro>