/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.anf__002d__code__002d__challenge.components.form.userform;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class userform_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
out.write("\n<div class=\"country__cmp\">\n\t<h2>User Form</h2>\n\n\t<form method=\"post\" action=\"/bin/saveUserDetails\" name=\"userform\" id=\"userform\" class=\"cmp-form\">\n\n\t\t<div>");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", "firstName", obj().with("decorationTagName", "div").with("resourceType", "anf-code-challenge/components/form/text"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("</div>\n\n\t\t<div>");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", "lastName", obj().with("decorationTagName", "div").with("resourceType", "anf-code-challenge/components/form/text"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("</div>\n\n\t\t<div>");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "age", obj().with("decorationTagName", "div").with("resourceType", "anf-code-challenge/components/form/text"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</div>\n\n\t\t<div>");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "country", obj().with("decorationTagName", "div").with("resourceType", "anf-code-challenge/components/form/country"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>\n\n\t\t<div>");
{
    Object var_resourcecontent4 = renderContext.call("includeResource", "submit", obj().with("decorationTagName", "div").with("resourceType", "anf-code-challenge/components/form/button"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent4));
}
out.write("</div>\n\n\n\t\t<div id=\"success-message\" style=\"display: none; color: green\">Data\n\t\t\tsaved successfully</div>\n\t\t<div id=\"error-message\" style=\"display: none; color: red\"></div>\n\n\t\t");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\n\t\t");
{
    Object var_templatevar5 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
    {
        String var_templateoptions6_field$_categories = "anf-code-challenge.components.form.userform.site";
        {
            java.util.Map var_templateoptions6 = obj().with("categories", var_templateoptions6_field$_categories);
            callUnit(out, renderContext, var_templatevar5, var_templateoptions6);
        }
    }
}
out.write("\n\t</form>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

