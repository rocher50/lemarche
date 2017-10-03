/*
 * Copyright 2017 Oleksiy Lubyanskyy and other contributors as indicated by
 * the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lemarche.core;

import java.util.Set;

/**
 * @author olubyans
 *
 */
public class Article {

    private int id;
    private PricedArticle basePrice;
    private Set<PricedArticle> alternativeBasePrices;
    private Set<ArticleCharacteristic> characteristics;
    private Brand brand;
    private long stock;
}
