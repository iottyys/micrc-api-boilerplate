package com.snszyk.iiot.lim.quota.domain.condition;

import com.snszyk.iiot.lim.quota.domain.condition.event.ConditionAddCommand;
import com.snszyk.iiot.lim.quota.domain.condition.exception.ConditionAddException;
import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRepository;
import com.snszyk.iiot.lim.quota.domain.condition.vo.ConditionId;
import com.snszyk.iiot.lim.quota.domain.condition.vo.ConditionInfo;
import com.snszyk.iiot.lim.quota.domain.condition.vo.ValueConstraint;

public class Condition {
    private ConditionId id;
    private ConditionInfo info;
    private ValueConstraint constraint;

//    值约束；
//      约束检查
//
//    void 删除条件 删除条件命令；
//    1 判断删除参数
//    2 调用持久化接口
//    void 添加条件 添加条件命令；
//    1 创建标识
//    2 设置命令接收对象
//    4 持久化
    public void add(ConditionAddCommand command) throws ConditionAddException {
        ConditionRepository repository = command.getRepository();
        this.id = new ConditionId(repository);
        this.info.check(repository);
        // todo 值约束枚举值重复检查
        try {
            repository.save(this);
        } catch (Throwable th) {
            throw new ConditionAddException(th);
        }

//        this.id = new ConditionId(conditionRepository);
//        this.info = new ConditionInfo().add(command);
//        this.constraint = command.getValueConstraint();
//        conditionRepository.saveCondition(this);
    }

//    void 维护条件信息 维护条件信息命令；
//    1 设置命令接收对象
//    3 持久化
//    void 维护值约束 维护值约束命令；
//    1 设置命令接收对象
//    2 持久化
//    void 约束检查 约束检查命令；
//    1 设置命令接收对象
//    2 执行命令
}
