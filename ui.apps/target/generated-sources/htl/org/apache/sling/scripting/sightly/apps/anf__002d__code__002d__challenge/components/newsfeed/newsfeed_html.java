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
package org.apache.sling.scripting.sightly.apps.anf__002d__code__002d__challenge.components.newsfeed;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class newsfeed_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_model = null;
Collection var_collectionvar2_list_coerced$ = null;
out.write("\n<div class=\"cmp-newsfeed\" data-cmp-is=\"newsfeed\">\n    <h2 class=\"cmp-newsfeed\">News Feed Component</h2>\n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "newsFeedPath");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-newsfeed\">\n\n        ");
_global_model = renderContext.call("use", com.anf.core.models.NewsFeedModel.class.getName(), obj());
        {
            Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_model, "feedList");
            if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
                out.write("<div class=\"cmp-newsfeed__items\">\n\n            ");
                {
                    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_model, "feedList");
                    {
                        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
                        {
                            boolean var_notempty4 = (var_size3 > 0);
                            if (var_notempty4) {
                                {
                                    long var_end7 = var_size3;
                                    {
                                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                                        if (var_validstartstepend8) {
                                            out.write("<div>");
                                            if (var_collectionvar2_list_coerced$ == null) {
                                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                                            }
                                            long var_index9 = 0;
                                            for (Object item : var_collectionvar2_list_coerced$) {
                                                {
                                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                                    if (var_traversal11) {
                                                        out.write("\n                <p>");
                                                        {
                                                            String var_12 = ("Title: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_12));
                                                        }
                                                        out.write("</p>\n                <p>");
                                                        {
                                                            String var_13 = ("Date: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "date"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_13));
                                                        }
                                                        out.write("</p>\n                <p>");
                                                        {
                                                            String var_14 = ("Author: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "author"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_14));
                                                        }
                                                        out.write("</p>\n                <p>");
                                                        {
                                                            String var_15 = ("Description: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_15));
                                                        }
                                                        out.write("</p>\n                <p>");
                                                        {
                                                            String var_16 = ("Image: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "urlImage"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_16));
                                                        }
                                                        out.write("</p>\n                <img");
                                                        {
                                                            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(item, "urlImage");
                                                            {
                                                                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
                                                                {
                                                                    Object var_shoulddisplayattr20 = ((renderContext.getObjectModel().toBoolean(var_attrcontent18) ? var_attrcontent18 : ("false".equals(var_attrvalue17))));
                                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr20)) {
                                                                        out.write(" src");
                                                                        {
                                                                            boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                                                            if (!var_istrueattr19) {
                                                                                out.write("=\"");
                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                                                                out.write("\"");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(" width=\"200\" height=\"200\"/>\n            ");
                                                    }
                                                }
                                                var_index9++;
                                            }
                                            out.write("</div>");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var_collectionvar2_list_coerced$ = null;
                }
                out.write("\n        </div>");
            }
        }
        out.write("\n    </div>");
    }
}
out.write("\n\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

