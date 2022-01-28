package com.study.alone.sql;

/**
 * @Author: hetilong
 * @Date: 2022/1/27 16:13
 */
public class AloneSql {
    public static void main(String[] args) {
        /**
         * 175. 组合两张表
         * 主要考察左链接，left join.....on
         */
        String sql175 = "select p.FirstName,p.LastName,a.City,a.State from person p \n" +
                "left join address a\n" +
                "on p.personId = a.personId";

        /**
         * 176,第二高薪水
         * 需考虑表为空的情况
         */
        String sql176 = "select IFNULL(\n" +
                "    (select distinct(Salary) from Employee order by Salary desc limit 1,1)\n" +
                "    ,null\n" +
                "    ) as SecondHighestSalary";

        /**
         * 177.第N高薪水
         */
        String sql177 = "CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT\n" +
                "BEGIN\n" +
                "SET N=N-1;\n" +
                "  RETURN (\n" +
                "      # Write your MySQL query statement below.\n" +
                "      select distinct salary from employee order by salary desc limit N,1\n" +
                "  );\n" +
                "END";

        /**
         * 196. 删除重复的电子邮箱
         */
        String sql196 = "delete p1 from" +
                "person p1,person p2" +
                "where p1.email = p2.email " +
                "and p1.id>p2.id";

        /**
         * 197.上升的温度
         * 主要考察 datadiff函数
         * 只有一张表，现在要找出今天温度比昨天温度高的日期 id 。
         * 所以需要用自连接，也就是把 weather 和 weather 进行自身连接。
         * 在自连之后，需要将自连后的表取个别名 w1 ，如果不取别名的话，两个 weather 表名会冲突。这里把 weather 作为今天表， w1 作为昨天表。
         * 两表自连之后需要有连接条件，连接条件是 今天和昨天的日期。
         * MySQL 提供了datediff 函数，用来比较两个日期之间的时间差，如果两个时间之间相差 1 天，那么就是今天和做题。
         * 最后在筛选出今天的温度高于昨天温度的数据
         */
        String sql197 = "select w.id from\n" +
                "weather w \n" +
                "JOIN\n" +
                "weather w1\n" +
                "ON DATEDIFF(W.recordDate,w1.recordDate) = 1\n" +
                "AND\n" +
                "w.Temperature > w1.Temperature;";
        /**
         * 596. 超过5名学生的课
         */
        String sql596 = "select class " +
                "from courses" +
                "group by class" +
                "having count(distinct student) >= 5";

    }
}
