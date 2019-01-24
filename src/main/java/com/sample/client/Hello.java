/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.sample.client;

import java.util.Date;
import java.util.Set;

	/**
	 * <div lang="ja">
	 * 開始・終了時刻指定を指定して、 ロウ集合またはその特定のカラムに対し
	 * 集計演算を行います。
	 *
	 * <p>{@code column}は、{@code aggregation}次第で無視されることが
	 * あります。演算対象には、開始・終了時刻と合致する境界上のロウも含まれます。
	 * 終了時刻より新しい開始時刻を指定した場合、すべてのロウが対象外となります。</p>
	 *
	 * @param start 開始時刻
	 * @param end 終了時刻
	 * @param column 集計対象のカラム名。合計演算のように、特定のカラムを
	 * 対象としない場合は{@code null}
	 * @param aggregation 集計方法
	 *
	 * @return 集計結果が設定された場合、対応する{@link AggregationResult}。
	 * 設定されなかった場合は{@code null}。詳細は{@link Aggregation}の定義を
	 * 参照のこと
	 *
	 * @see Aggregation
	 * </div>
	 */

public class Hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }
}
