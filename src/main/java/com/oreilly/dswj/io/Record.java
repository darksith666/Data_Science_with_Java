/* 
 * Copyright 2017 Michael Brzustowicz.
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
package com.oreilly.dswj.io;

/**
 *
 * @author Michael Brzustowicz
 */
public class Record {
    public int id;
    public int year;
    public String city;

    public Record() {
    }

    public Record(int id, int year, String city) {
        this.id = id;
        this.year = year;
        this.city = city;
    }
    
}
