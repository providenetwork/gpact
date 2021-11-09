package net.consensys.gpact.test.soliditywrappers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.7-SNAPSHOT.
 */
@SuppressWarnings("rawtypes")
public class BlsSignatureTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610d50806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063bbb82d891461003b578063f6e548e91461005c575b600080fd5b6000546100489060ff1681565b604051901515815260200160405180910390f35b61006f61006a366004610b93565b610071565b005b60006100b287878080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525061015492505050565b905060006100f584848080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525061027292505050565b90506101398287878080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250869250610344915050565b6000805460ff19169115159190911790555050505050505050565b61015c610acb565b60408051600480825260a082019092526000916020820160808036833701905050905060205b815161018f906020610c59565b81116101af5783810151828201526101a8602082610c78565b9050610182565b50806000815181106101c3576101c3610c90565b60209081029190910101518251528051819060019081106101e6576101e6610c90565b602090810291909101015182516001602002015280518190600290811061020f5761020f610c90565b6020026020010151826020015160006002811061022e5761022e610c90565b602002015280518190600390811061024857610248610c90565b6020026020010151826020015160016002811061026757610267610c90565b602002015250919050565b6040805180820182526000808252602082018190528251600280825260608201909452919290919081602001602082028036833701905050905060205b81516102bc906020610c59565b81116102dc5783810151828201526102d5602082610c78565b90506102af565b50604051806040016040528060008152602001600081525091508060008151811061030957610309610c90565b60200260200101518260000181815250508060018151811061032d5761032d610c90565b602002602001015182602001818152505050919050565b60408051600280825260608201909252600091829190816020015b604080518082019091526000808252602082015281526020019060019003908161035f5750506040805160028082526060820190925291925060009190602082015b6103a9610acb565b8152602001906001900390816103a15790505090506103c784610465565b826000815181106103da576103da610c90565b60200260200101819052506103ee856104fb565b8260018151811061040157610401610c90565b60200260200101819052506104146105f2565b8160008151811061042757610427610c90565b6020026020010181905250858160018151811061044657610446610c90565b602002602001018190525061045b82826106b2565b9695505050505050565b60408051808201909152600080825260208201527f30644e72e131a029b85045b68181585d97816a916871ca8d3c208c16d87cfd476104a383610a08565b156104c35750506040805180820190915260008082526020820152919050565b6040518060400160405280846000015181526020018285602001516104e89190610ca6565b6104f29084610cc8565b90529392505050565b60408051808201825260008082526020808301829052845185820120845180860190955282855290840182905291925b600061053a60ff841685610c78565b905061057161056b604080518082018252600080825260209182015281518083019092526001825260029082015290565b82610a22565b915061057c82610a08565b61058657506105ea565b8261059081610cdf565b935050600a60ff8416106105e45760405162461bcd60e51b815260206004820152601660248201527511985a5b1959081d1bc81b585c081d1bc81c1bda5b9d60521b60448201526064015b60405180910390fd5b5061052b565b949350505050565b6105fa610acb565b50604080516080810182527f198e9393920d483a7260bfb731fb5d25f1aa493335a9e71297e485b7aef312c28183019081527f1800deef121f1e76426a00665e5c4479674322d4f75edadd46debd5cd992f6ed6060830152815281518083019092527f090689d0585ff075ec9e99ad690c3395bc4b313370b38ef355acdadcd122975b82527f12c85ea5db8c6deb4aab71808dcb408fe3d1e7690c43d37b4ce6cc0166fa7daa60208381019190915281019190915290565b600081518351146106fd5760405162461bcd60e51b81526020600482015260156024820152742837b4b73a1031b7bab73a1036b4b9b6b0ba31b41760591b60448201526064016105db565b8251600061070c826006610c59565b905060008167ffffffffffffffff81111561072957610729610c2d565b604051908082528060200260200182016040528015610752578160200160208202803683370190505b50905060005b8381101561098d5786818151811061077257610772610c90565b6020026020010151600001518282600661078c9190610c59565b610797906000610c78565b815181106107a7576107a7610c90565b6020026020010181815250508681815181106107c5576107c5610c90565b602002602001015160200151828260066107df9190610c59565b6107ea906001610c78565b815181106107fa576107fa610c90565b60200260200101818152505085818151811061081857610818610c90565b6020908102919091010151515182610831836006610c59565b61083c906002610c78565b8151811061084c5761084c610c90565b60200260200101818152505085818151811061086a5761086a610c90565b60209081029190910181015151015182610885836006610c59565b610890906003610c78565b815181106108a0576108a0610c90565b6020026020010181815250508581815181106108be576108be610c90565b6020026020010151602001516000600281106108dc576108dc610c90565b6020020151826108ed836006610c59565b6108f8906004610c78565b8151811061090857610908610c90565b60200260200101818152505085818151811061092657610926610c90565b60200260200101516020015160016002811061094457610944610c90565b602002015182610955836006610c59565b610960906005610c78565b8151811061097057610970610c90565b60209081029190910101528061098581610cff565b915050610758565b50610996610af0565b6000602082602086026020860160086107d05a03fa9050806109fa5760405162461bcd60e51b815260206004820152601960248201527f50616972696e67206f7065726174696f6e206661696c65642e0000000000000060448201526064016105db565b505115159695505050505050565b8051600090158015610a1c57506020820151155b92915050565b6040805180820190915260008082526020820152610a3e610b0e565b83518152602080850151818301526040808301859052805180820182526000808252928101839052908160608560076107d05a03fa915081610ac25760405162461bcd60e51b815260206004820152601c60248201527f506f696e74206d756c7469706c69636174696f6e206661696c65642e0000000060448201526064016105db565b95945050505050565b6040518060400160405280610ade610b2c565b8152602001610aeb610b2c565b905290565b60405180602001604052806001906020820280368337509192915050565b60405180606001604052806003906020820280368337509192915050565b60405180604001604052806002906020820280368337509192915050565b60008083601f840112610b5c57600080fd5b50813567ffffffffffffffff811115610b7457600080fd5b602083019150836020828501011115610b8c57600080fd5b9250929050565b60008060008060008060608789031215610bac57600080fd5b863567ffffffffffffffff80821115610bc457600080fd5b610bd08a838b01610b4a565b90985096506020890135915080821115610be957600080fd5b610bf58a838b01610b4a565b90965094506040890135915080821115610c0e57600080fd5b50610c1b89828a01610b4a565b979a9699509497509295939492505050565b634e487b7160e01b600052604160045260246000fd5b634e487b7160e01b600052601160045260246000fd5b6000816000190483118215151615610c7357610c73610c43565b500290565b60008219821115610c8b57610c8b610c43565b500190565b634e487b7160e01b600052603260045260246000fd5b600082610cc357634e487b7160e01b600052601260045260246000fd5b500690565b600082821015610cda57610cda610c43565b500390565b600060ff821660ff811415610cf657610cf6610c43565b60010192915050565b6000600019821415610d1357610d13610c43565b506001019056fea2646970667358221220d154d332d227c97d81c55ffe23707cf5fe054b812d49b9d390fd5ba67875619d64736f6c63430008090033";

    public static final String FUNC_VERIFIED = "verified";

    public static final String FUNC_VERIFYSIGNATURE = "verifySignature";

    @Deprecated
    protected BlsSignatureTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BlsSignatureTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected BlsSignatureTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected BlsSignatureTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Boolean> verified() {
        final Function function = new Function(FUNC_VERIFIED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> verifySignature(byte[] _publicKey, byte[] _message, byte[] _signature) {
        final Function function = new Function(
                FUNC_VERIFYSIGNATURE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(_publicKey), 
                new org.web3j.abi.datatypes.DynamicBytes(_message), 
                new org.web3j.abi.datatypes.DynamicBytes(_signature)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static BlsSignatureTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BlsSignatureTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static BlsSignatureTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BlsSignatureTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static BlsSignatureTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new BlsSignatureTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BlsSignatureTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new BlsSignatureTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BlsSignatureTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BlsSignatureTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BlsSignatureTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BlsSignatureTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<BlsSignatureTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BlsSignatureTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BlsSignatureTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BlsSignatureTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
