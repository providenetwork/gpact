/*
 * Copyright 2019 ConsenSys Software Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package net.consensys.gpact.appcontracts.erc20;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Check operation of the contract prior to any data being added to the contract.
 * That is, check the default configuration immediately after deployment.
 */
public class LockableERC20InitTest extends AbstractERC20Test {
  @Test
  public void checkDeployment() throws Exception {
    setupWeb3();
    deployContracts();

    assert(this.lockableERC20.totalSupply().send().compareTo(INITIAL_SUPPLY_BIG) == 0);
    assert(this.lockableERC20.totalSupplyProvisional().send().compareTo(INITIAL_SUPPLY_BIG) == 0);
    assert(this.lockableERC20.totalSupplyMin().send().compareTo(INITIAL_SUPPLY_BIG) == 0);
    assert(this.lockableERC20.totalSupplyMax().send().compareTo(INITIAL_SUPPLY_BIG) == 0);

    assert(this.lockableERC20.balanceOf(this.owner).send().compareTo(INITIAL_SUPPLY_BIG) == 0);
    assert(this.lockableERC20.balanceOfMin(this.owner).send().compareTo(INITIAL_SUPPLY_BIG) == 0);
    assert(this.lockableERC20.balanceOfProvisional(this.owner).send().compareTo(INITIAL_SUPPLY_BIG) == 0);

    assert(this.lockableERC20.balanceOf(this.otherAccount).send().compareTo(BigInteger.ZERO) == 0);
    assert(this.lockableERC20.balanceOfMin(this.otherAccount).send().compareTo(BigInteger.ZERO) == 0);
    assert(this.lockableERC20.balanceOfProvisional(this.otherAccount).send().compareTo(BigInteger.ZERO) == 0);
  }

}
