/**
 * Copyright 2016-2018 lee123lee123.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.boot.dubbo.validation;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.validation.Validator;
import com.alibaba.dubbo.validation.support.AbstractValidation;
import com.alibaba.dubbo.validation.support.jvalidation.JValidator;

/**
 * copy from @ com.alibaba.dubbo.validation.support.jvalidation; 修改版
 *
 * @author   喝咖啡的囊地鼠
 *
 */
public class JValidation extends AbstractValidation {
    @Override
    protected Validator createValidator(URL url) {
        return new JValidator(url);
    }
}
